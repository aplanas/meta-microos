SUMMARY = "The universal package manager library"
DESCRIPTION = "Often, scripts need to install system dependencies using the native package \
manager of the user's OS. Typically, this is solved by having some bash script \
that runs apt-get, assuming the user is on Ubuntu. Smarter scripts use hand \
crafted code to detect the user's platform and aggregate a set of dependencies \
on a few of the more popular platforms. Our approach is different: \
  * Parse package format (devel/debug/normal library or executable) \
  * Look up package managers that exist in PATH \
  * Format parsed package with common package convention of package manager \
 \
More on https://github.com/MycroftAI/pako"
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python310-pako-0.3.1-1.5.noarch.rpm"
RPM_HASH = "70c13d88d1502a5469dcd16a386ff803dee9ca70f2c931b4dba77b091e78d96da6799dce935e680e1e6bef11afa70d9d3e0d63e1f321ce111197093ad03d03b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pako \
python310-pako \
python3dist-pako"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-appdirs \
update-alternatives"

inherit rpm
