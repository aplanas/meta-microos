SUMMARY = "Python whois library"
DESCRIPTION = "Module for retrieving and parsing the WHOIS data for a domain."
LICENSE = "WTFPL"

PV = "2.4.3"

RPM_NAME = "python310-pythonwhois-2.4.3-5.11.noarch.rpm"
RPM_HASH = "cfca872e56e18625d259dec70ac007735eb14680987905a0f56049c59e700cb61e678e8df1e42dd1fefb8ae3ed7c294b5fd8a8a0778673d3f99f0643bf5cd692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythonwhois \
python3.10dist(pythonwhois) \
python310-pythonwhois \
python3dist(pythonwhois)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
