SUMMARY = "Static gallery generator"
DESCRIPTION = "Sigal is a static gallery generator written in Python with the following \
features: \
 \
* Generates HTML pages using jinja2 templates. \
* Emits relative links for a portable output. \
* Supports themes, videos, EXIF tags, and ZIP downloading. \
* Processes directories recursively and files in parallel. \
 \
The idea behind Sigal is to ease the use of the JavaScript libraries like \
galleria_. These libraries display the images, Sigal on the other hand does \
image resizing, thumbnail creation and HTML page generation."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python39-sigal-2.3-1.7.noarch.rpm"
RPM_HASH = "48f44b6d7ae90280d675a09a47e52c8fd25a0ef8338abfa3e6a636e3636828b644d2cf0570f543c9ad7016cbbd19bc05c90d0328b46862cda680b5468e2439c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sigal) \
python39-sigal \
python3dist(sigal)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Jinja2 \
python39-Markdown \
python39-Pillow \
python39-blinker \
python39-click \
python39-natsort \
python39-pilkit \
update-alternatives"

inherit rpm
