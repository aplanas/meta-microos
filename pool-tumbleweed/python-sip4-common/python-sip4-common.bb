SUMMARY = "SIP tool to create python bindings -- common files"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains common files shared between python2 and python3 \
versions of sip."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python-sip4-common-4.19.25-6.5.noarch.rpm"
RPM_HASH = "3ccc30d86a0dc7b0d03a0bff1596133c887162d092a4b8b890663ff9524c47ccdb4fde6b849d5761ef259e6e3bf10130b8b55c15072bd69dd505bf8cdd4e9cbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sip4-common \
python310-sip4-common \
python39-sip4-common \
rpm_macro(python_sip_api_ver) \
rpm_macro(requires_python3_sip_api)"

RDEPENDS:${PN} += ""

inherit rpm
