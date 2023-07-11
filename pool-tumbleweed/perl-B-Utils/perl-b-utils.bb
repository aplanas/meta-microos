SUMMARY = "Helper functions for op tree manipulation"
DESCRIPTION = "Helper functions for op tree manipulation"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.27"

RPM_NAME = "perl-B-Utils-0.27-1.37.aarch64.rpm"
RPM_HASH = "39a50b74322846143a629fa01d5dbc277d79be25895785ec04879b2062380770c9abb5932fd4655adc16b3295385de8b3466ad0e8aa4f4988405ef6402a82f68"

RPROVIDES:${PN} += "perl-B--Utils \
perl-B--Utils--Install--Files \
perl-B--Utils--OP \
perl-B-Utils"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Task--Weaken"

inherit rpm
