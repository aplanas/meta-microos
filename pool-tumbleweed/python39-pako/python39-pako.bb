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

RPM_NAME = "python39-pako-0.3.1-1.5.noarch.rpm"
RPM_HASH = "ff8a3bffc0c000bdef6991e2aedaa7edc69c0eb8e8b606f6add64af22da8dedfc0176a968cc5a64cb1c69677a52421a0be6c59b2ae9ab19d3d010352f33c334e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pako \
python39-pako \
python3dist-pako"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-appdirs \
update-alternatives"

inherit rpm
