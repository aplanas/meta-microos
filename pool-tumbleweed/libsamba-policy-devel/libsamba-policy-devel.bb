SUMMARY = "Development files for the Samba AD Group Policy library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libsamba-policy."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "libsamba-policy-devel-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "c53bdb3b6b81336be9dc8b5be9c637206c2a69117906692aa3f65657260c0111efd7cb171c99242bf7f0bfa5deeb1a77e69106211cd3204dae55c5f724becca0"

RPROVIDES:${PN} += "libsamba-policy-devel"

RDEPENDS:${PN} += "libsamba-policy-python3-devel"

inherit rpm
