SUMMARY = "A logging module for Python"
DESCRIPTION = "* Logs to console and/or file. \
* Pretty formatting, including level-specific colors in the console. \
* Robust against str/bytes encoding problems, works with all kinds of character encodings and special characters. \
* Heavily inspired by the Tornado web framework."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-logzero-1.7.0-3.8.noarch.rpm"
RPM_HASH = "bde5f27ed00a916cf231ed487ecde1e828bcfdf63be98fa2eeeec145813b73f662ada5d8d3dc6e9c351ac143fab90a03f5138b5818b399599e42361ce0172a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logzero \
python3.10dist(logzero) \
python310-logzero \
python3dist(logzero)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
