SUMMARY = "Markdown URL utilities"
DESCRIPTION = "A Python port of the JavaScript mdurl package. Formats and parses URLs in Markdown-Format."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-mdurl-0.1.2-2.1.noarch.rpm"
RPM_HASH = "95390dee4e0309b15893dac7353761b390d283c3405fc725f62ada2f4a2674122b6e0c45cce9eee21a830b23495eaec8a90ca33fb70f40bfe64f7fa5db18195e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mdurl \
python3.10dist(mdurl) \
python310-mdurl \
python3dist(mdurl)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
