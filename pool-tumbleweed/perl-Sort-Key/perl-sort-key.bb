SUMMARY = "the fastest way to sort anything in Perl"
DESCRIPTION = "Sort::Key provides a set of functions to sort lists of values by some \
calculated key value. \
 \
It is faster (usually *much faster*) and uses less memory than other \
alternatives implemented around perl sort function (ST, GRT, etc.). \
 \
Multi-key sorting functionality is also provided via the companion modules \
the Sort::Key::Multi manpage, the Sort::Key::Maker manpage and the \
Sort::Key::Register manpage."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.33"

RPM_NAME = "perl-Sort-Key-1.33-1.32.aarch64.rpm"
RPM_HASH = "22f6bcc95b8ebcb5e2e918a6de3926a92769996dd5fc4fb42af312697cc67d9e21e0d2c79d3f04a8a52b9af89a120c953ea48ddde35eb61a8bb0701bccd96c4d"

RPROVIDES:${PN} += "perl(Sort::Key) \
perl(Sort::Key::Maker) \
perl(Sort::Key::Multi) \
perl(Sort::Key::Natural) \
perl(Sort::Key::Register) \
perl(Sort::Key::Types) \
perl-Sort-Key \
perl-Sort-Key(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
