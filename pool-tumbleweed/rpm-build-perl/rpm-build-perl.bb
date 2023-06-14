SUMMARY = "RPM dependency generator for Perl"
DESCRIPTION = "Provides and requires generator for .pl files and modules."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-build-perl-4.18.0-5.1.aarch64.rpm"
RPM_HASH = "275882248deadf039c3622ebd5e276cddbe3f2e05b3509b6ea242889ecb7b86d78a8fb946b77c42bd6f305cbb3320587d198b81c1526df6841c25161721474c2"

RPROVIDES:${PN} += "rpm-build-perl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-base"

inherit rpm
