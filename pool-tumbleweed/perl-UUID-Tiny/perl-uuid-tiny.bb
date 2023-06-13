SUMMARY = "Pure Perl UUID Support With Functional Interface"
DESCRIPTION = "UUID::Tiny is a lightweight, low dependency Pure Perl module for UUID \
creation and testing. This module provides the creation of version 1 time \
based UUIDs (using random multicast MAC addresses), version 3 MD5 based \
UUIDs, version 4 random UUIDs, and version 5 SHA-1 based UUIDs. \
 \
ATTENTION! UUID::Tiny uses Perl's 'rand()' to create the basic random \
numbers, so the created v4 UUIDs are *not* cryptographically strong! \
 \
No fancy OO interface, no plethora of different UUID representation formats \
and transformations - just string and binary. Conversion, test and time \
functions equally accept UUIDs and UUID strings, so don't bother to convert \
UUIDs for them! \
 \
Continuing with 1.0x versions all constants and public functions are \
exported by default, but this will change in the future (see below). \
 \
UUID::Tiny deliberately uses a minimal functional interface for UUID \
creation (and conversion/testing), because in this case OO looks like \
overkill to me and makes the creation and use of UUIDs unnecessarily \
complicated. \
 \
If you need raw performance for UUID creation, or the real MAC address in \
version 1 UUIDs, or an OO interface, and if you can afford module \
compilation and installation on the target system, then better look at \
other CPAN UUID modules like the Data::UUID manpage. \
 \
This module is 'fork safe', especially for random UUIDs (it works around \
Perl's rand() problem when forking processes). \
 \
This module is currently *not* 'thread safe'. Even though I've incorporated \
some changes proposed by Michael G. Schwern (thanks!), Digest::MD5 and \
Digest::SHA seem so have trouble with threads. There is a test file for \
threads, but it is de-activated. So use at your own risk!"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.04"

RPM_NAME = "perl-UUID-Tiny-1.04-1.4.noarch.rpm"
RPM_HASH = "e2da0ac81dade577256a37bf06590af237d68c1c63a911f881d1a8c51ca314a60529d2146f42146f9220e77151a2c8f1a97cbe7ac76b7f928bc31c32376fd7cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(UUID::Tiny) \
perl-UUID-Tiny"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
