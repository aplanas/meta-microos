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

RPM_NAME = "python39-pelican-4.8.0-2.4.noarch.rpm"
RPM_HASH = "711546be09954002ba0b045e11e70027561e909d2b31a0dda2ead81e6021d5b407ec1b78ea5077e78697542557518332ea2f94a848cef1ad309193410c49ac42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pelican \
python39-pelican \
python3dist-pelican"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
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
