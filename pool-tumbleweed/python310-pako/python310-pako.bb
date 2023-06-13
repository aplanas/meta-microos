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

RPM_NAME = "python310-pako-0.3.1-1.4.noarch.rpm"
RPM_HASH = "f19f4eb54130ec54324418d8faf2e45541587c0c3b6be6f894e9d9176fee3ac68dc93d80b1421933173d5823d0ab35a4090a1358e275d40c17dc909d522626b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pako \
python3.10dist(pako) \
python310-pako \
python3dist(pako)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-appdirs \
update-alternatives"

inherit rpm
