SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies"
DESCRIPTION = "Small and dependency free `Python`_ package to infer file type and MIME \
type checking the `magic numbers`_ signature of a file or buffer. \
 \
This is a Python port from `filetype`_ Go package."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-filetype-1.2.0-1.4.noarch.rpm"
RPM_HASH = "c46519c20bcb38db992f92b1df26f26d4a2dc0a29698d24f955c74f0a93119b8f268b47f0b63511b70ed5935d25b6bf3c5095649b4b55aca2678f38a288906fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(filetype) \
python39-filetype \
python3dist(filetype)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
