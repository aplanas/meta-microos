SUMMARY = "Command line tool to unpack anything"
DESCRIPTION = "/usr/bin/file-unpack is a trivial command line frontend that \
ships with the File::Unpack perl module."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.70"

RPM_NAME = "file-unpack-0.70-7.12.aarch64.rpm"
RPM_HASH = "43d670eda4b6484a8155adfdb0541fbb555692e68909af9761bc532e699a29e416275a4a152f6039010c36626315db8a6d16cab195bf47be7cb7299a8f4ebd8b"

RPROVIDES:${PN} += "file-unpack"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
perl-File--Unpack"

inherit rpm
