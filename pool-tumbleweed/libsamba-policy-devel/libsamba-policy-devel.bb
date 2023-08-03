SUMMARY = "Development files for the Samba AD Group Policy library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libsamba-policy."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "libsamba-policy-devel-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "46ae19a5ee4cce7516d058eb5a26aea6f89204dcac29e129f080e5c61be85f13ec8ec8720557854ba95785bef2a249cb7e3a0b8b57f9fe337e8dffd293857828"

RPROVIDES:${PN} += "libsamba-policy-devel"

RDEPENDS:${PN} += "libsamba-policy-python3-devel"

inherit rpm
