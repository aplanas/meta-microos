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

RPM_NAME = "python39-pelican-4.8.0-2.7.noarch.rpm"
RPM_HASH = "892d23130653db95ac62f7f588d7074c777f6657f2c53d4620e9333853635e2ac1620bc677c7062ea421abbf256798a4d5a97a124c8cb9e633f45b99760a00ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pelican \
python39-pelican \
python3dist-pelican"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-Pygments \
python39-Unidecode \
python39-blinker \
python39-docutils \
python39-feedgenerator \
python39-python-dateutil \
python39-pytz \
python39-rich \
update-alternatives"

inherit rpm
