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

RPM_NAME = "python310-pelican-4.8.0-2.6.noarch.rpm"
RPM_HASH = "bdc56689df758a62cd9dca2f2f7783a8635d3389c5150c6f65f5418e761071a16ae8dba7d813e14b1b086b2aa90b132f9d2036018560d547d61e282d13f5a072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pelican \
python310-pelican \
python3dist-pelican"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
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
