SUMMARY = "SIP tool to create python bindings"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains all the developer tools you need to create your \
own sip bindings."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python39-sip4-devel-4.19.25-6.5.aarch64.rpm"
RPM_HASH = "c505c6e6a4049c56ce2887ca4a6d7127bcde2a2926eb09e514d09907caa5ee7fc94e6bcf003c283e304f0cdd680b6b4c1e010748a09ed457f267fa13e909f606"

RPROVIDES:${PN} += "python39-sip-bin \
python39-sip-devel \
python39-sip4-devel \
python39-sip4-devel(aarch-64) \
rpm_macro(requires_python39_sip_api)"

RDEPENDS:${PN} += "/bin/sh \
c++_compiler \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python39-devel \
python39-sip4 \
python39-sip4-common \
update-alternatives"

inherit rpm
