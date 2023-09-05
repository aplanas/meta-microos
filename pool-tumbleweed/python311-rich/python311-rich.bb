SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.5.2"

RPM_NAME = "python311-rich-13.5.2-1.1.noarch.rpm"
RPM_HASH = "03540b3c3f84784109564133194c46f83bf79a14fd325887033c5f97db405764ed1aa17ab6d118b5cc78ea731bf8a082f881f64758df96a2260e2afc2e254e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich \
python3.11dist-rich \
python311-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python311-markdown-it-py \
python311-pygments"

inherit rpm
