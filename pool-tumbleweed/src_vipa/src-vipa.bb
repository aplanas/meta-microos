SUMMARY = "Virtual Source IP address support for HA solutions"
DESCRIPTION = "This package provides very flexible means of source IP address \
selection to arbitrary applications. This is particularly useful for \
high availability setups, where the dummy device holds a 'VIPA' \
(virtual IP address). Please read the \
/usr/share/doc/packages/src_vipa/README and the manpage of src_vipa for \
further information."
LICENSE = "CPL-1.0"

PV = "2.1.0"

RPM_NAME = "src_vipa-2.1.0-4.6.aarch64.rpm"
RPM_HASH = "ae0e56a69af36474b966ca060d6f638e35ce9d11bed2f91bbb6014a5780c4bfc3ff0ebcf59f28b246a1aabc248f0597671bb0c923a71a6988d1e5922b958f2be"

RPROVIDES:${PN} += "src_vipa \
src_vipa(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
libc.so.6()(64bit)"

inherit rpm
