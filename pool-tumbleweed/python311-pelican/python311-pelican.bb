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

RPM_NAME = "python311-pelican-4.8.0-2.7.noarch.rpm"
RPM_HASH = "a6e9b4abbe827947e035e09d508c0d17e87fd5ac58c48e6d8057efb35f3d21d3955458727b4bdb40c054110124b592df50df6e39c62429378924bec98eaae4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pelican \
python3.11dist-pelican \
python311-pelican \
python3dist-pelican"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-Pygments \
python311-Unidecode \
python311-blinker \
python311-docutils \
python311-feedgenerator \
python311-python-dateutil \
python311-pytz \
python311-rich \
update-alternatives"

inherit rpm
