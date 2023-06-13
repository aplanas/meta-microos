SUMMARY = "A tool to generate a static blog from reStructuredText or Markdown input files"
DESCRIPTION = "Pelican is a static site generator, written in Python. \
 \
* Write your weblog entries directly with your editor of choice in reStructuredText, Markdown or AsciiDoc \
* Includes a simple CLI tool to (re)generate the weblog \
* Easy to interface with DVCSes and web hooks \
* Completely static output is easy to host anywhere \
 \
Pelican currently supports: \
 \
* Blog articles and pages \
* Comments, via an external service \
* Theming support (themes are created using Jinja2 templates) \
* PDF generation of the articles/pages (optional) \
* Publication of articles in multiple languages \
* Atom/RSS feeds \
* Code syntax highlighting \
* Asset management with webassets (optional) \
* Import from WordPress, Dotclear, or RSS feeds \
* Integration with external tools: Twitter, Google Analytics, etc. (optional)"
LICENSE = "AGPL-3.0-only"

PV = "4.8.0"

RPM_NAME = "python310-pelican-4.8.0-2.4.noarch.rpm"
RPM_HASH = "3730eeca2a5e715d42832254ca067ceb4f1dd284cd0518870f9bb6d28cea62f152d2f444f8ea70299c96198f4095b801e9f0302352c4c72b763cf5c063276a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pelican \
python3.10dist(pelican) \
python310-pelican \
python3dist(pelican)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Jinja2 \
python310-Pygments \
python310-Unidecode \
python310-blinker \
python310-docutils \
python310-feedgenerator \
python310-python-dateutil \
python310-pytz \
python310-rich \
update-alternatives"

inherit rpm
