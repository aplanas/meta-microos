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

RPM_NAME = "python311-pako-0.3.1-1.5.noarch.rpm"
RPM_HASH = "6b1713e3941e10eee5d02dda3b83b6c8fa94a890a53c67a5a7c5a5d12e3bf06fccfaff571f4d2496c7fc3b2336cebed604975ee5336c0828c801a71dd9a57bc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pako \
python3.11dist-pako \
python311-pako \
python3dist-pako"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-appdirs \
update-alternatives"

inherit rpm
