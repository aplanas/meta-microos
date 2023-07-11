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

RPM_NAME = "python-sip4-common-4.19.25-7.1.noarch.rpm"
RPM_HASH = "16add7b3eed0ca05c41239f4ecb520998e1a737c11ba06a233bdd0d8d226872d8036294b4899e856340a26d7f0da0f1b3216cd5b83d187713f121d8dfe8ce649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sip4-common \
python310-sip4-common \
python311-sip4-common \
python39-sip4-common \
rpm-macro-python-sip-api-ver \
rpm-macro-requires-python3-sip-api"

RDEPENDS:${PN} += ""

inherit rpm
