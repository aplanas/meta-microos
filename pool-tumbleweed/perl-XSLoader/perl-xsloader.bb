SUMMARY = "Dynamically load C libraries into Perl code"
DESCRIPTION = "This module defines a standard _simplified_ interface to the dynamic \
linking mechanisms available on many platforms. Its primary purpose is to \
implement cheap automatic dynamic loading of Perl modules. \
 \
For a more complicated interface, see DynaLoader. Many (most) features of \
'DynaLoader' are not implemented in 'XSLoader', like for example the \
'dl_load_flags', not honored by 'XSLoader'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.24"

RPM_NAME = "perl-XSLoader-0.24-1.26.aarch64.rpm"
RPM_HASH = "2b11f26a63b7f33ab08676c137a3f0de0e02495805bf7938001b87f0d7707ce42b4934bd767425586469bc6138fa8c6ab7bb4b5a51758d9e998d27ed04023d37"

RPROVIDES:${PN} += "perl(DynaLoader) \
perl(XSLoader) \
perl-XSLoader \
perl-XSLoader(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
