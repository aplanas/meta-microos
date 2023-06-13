SUMMARY = "Comma-Separated Values manipulation routines"
DESCRIPTION = "Text::CSV_XS provides facilities for the composition and decomposition of \
comma-separated values. An instance of the Text::CSV_XS class will combine \
fields into a 'CSV' string and parse a 'CSV' string into fields. \
 \
The module accepts either strings or files as input and support the use of \
user-specified characters for delimiters, separators, and escapes."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.50"

RPM_NAME = "perl-Text-CSV_XS-1.50-1.2.aarch64.rpm"
RPM_HASH = "31136e3e48c346d2a3f2b2a4105e6c0fa29b50993ab811e448be4944ae2d1a4b0020526626817e1f44eb1de24174f655f37b38669744aa887ee9da45c4e39666"

RPROVIDES:${PN} += "perl(Text::CSV_XS) \
perl-Text-CSV_XS \
perl-Text-CSV_XS(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
