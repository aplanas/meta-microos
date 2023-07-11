SUMMARY = "HTTP library inspired by python-requests"
DESCRIPTION = "treq is an HTTP library inspired by requests but written on top of Twisted’s Agents. \
It provides a simple, higher level API for making HTTP requests when using Twisted."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python311-treq-22.2.0-3.1.noarch.rpm"
RPM_HASH = "d5cb19be6f4f11804442ddf25777a272ef3fda682005c54c810c0a487e6ce7d13383afe908cfaae8ce0d78c287b371dea2146a40e4bf8846f02cdbe47e4f0223"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-treq \
python3.11dist-treq \
python311-treq \
python3dist-treq"

RDEPENDS:${PN} += "python-abi \
python311-Twisted-tls \
python311-attrs \
python311-hyperlink \
python311-incremental \
python311-requests"

inherit rpm
