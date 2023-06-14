SUMMARY = "Check what OS we're running on"
DESCRIPTION = "A learned sage once wrote on IRC: \
 \
   $^O is stupid and ugly, it wears its pants as a hat \
 \
Devel::CheckOS provides a more friendly interface to $^O, and also lets you \
check for various OS 'families' such as 'Unix', which includes things like \
Linux, Solaris, AIX etc. \
 \
It spares perl the embarrassment of wearing its pants on its head by \
covering them with a splendid Fedora."
LICENSE = "Artistic-1.0 | GPL-2.0-only"

PV = "1.96"

RPM_NAME = "perl-Devel-CheckOS-1.96-1.1.noarch.rpm"
RPM_HASH = "adf16e863c146d9d450a1ce9f1f928e6e3856281d9937947b530adf97dde3930a9db695a0f4dfa7aa276e87f1c615ce64ac67945ff055350993213a55b574868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--AssertOS \
perl-Devel--AssertOS--AIX \
perl-Devel--AssertOS--Alias--MacOS \
perl-Devel--AssertOS--Amiga \
perl-Devel--AssertOS--Android \
perl-Devel--AssertOS--Apple \
perl-Devel--AssertOS--BSDOS \
perl-Devel--AssertOS--BeOS \
perl-Devel--AssertOS--Bitrig \
perl-Devel--AssertOS--Cygwin \
perl-Devel--AssertOS--DEC \
perl-Devel--AssertOS--DGUX \
perl-Devel--AssertOS--DragonflyBSD \
perl-Devel--AssertOS--Dynix \
perl-Devel--AssertOS--EBCDIC \
perl-Devel--AssertOS--FreeBSD \
perl-Devel--AssertOS--GNUkFreeBSD \
perl-Devel--AssertOS--HPUX \
perl-Devel--AssertOS--HWCapabilities--Int32 \
perl-Devel--AssertOS--HWCapabilities--Int64 \
perl-Devel--AssertOS--Haiku \
perl-Devel--AssertOS--Hurd \
perl-Devel--AssertOS--Interix \
perl-Devel--AssertOS--Irix \
perl-Devel--AssertOS--Linux \
perl-Devel--AssertOS--Linux--Debian \
perl-Devel--AssertOS--Linux--Devuan \
perl-Devel--AssertOS--Linux--Raspbian \
perl-Devel--AssertOS--Linux--RealDebian \
perl-Devel--AssertOS--Linux--Ubuntu \
perl-Devel--AssertOS--Linux--UnknownDebianLike \
perl-Devel--AssertOS--Linux--v2-6 \
perl-Devel--AssertOS--MPEiX \
perl-Devel--AssertOS--MSDOS \
perl-Devel--AssertOS--MSWin32 \
perl-Devel--AssertOS--MSYS \
perl-Devel--AssertOS--MacOSX \
perl-Devel--AssertOS--MacOSX--v10-0 \
perl-Devel--AssertOS--MacOSX--v10-1 \
perl-Devel--AssertOS--MacOSX--v10-10 \
perl-Devel--AssertOS--MacOSX--v10-11 \
perl-Devel--AssertOS--MacOSX--v10-12 \
perl-Devel--AssertOS--MacOSX--v10-13 \
perl-Devel--AssertOS--MacOSX--v10-14 \
perl-Devel--AssertOS--MacOSX--v10-15 \
perl-Devel--AssertOS--MacOSX--v10-2 \
perl-Devel--AssertOS--MacOSX--v10-3 \
perl-Devel--AssertOS--MacOSX--v10-4 \
perl-Devel--AssertOS--MacOSX--v10-5 \
perl-Devel--AssertOS--MacOSX--v10-6 \
perl-Devel--AssertOS--MacOSX--v10-7 \
perl-Devel--AssertOS--MacOSX--v10-8 \
perl-Devel--AssertOS--MacOSX--v10-9 \
perl-Devel--AssertOS--MacOSX--v11 \
perl-Devel--AssertOS--MacOSX--v12 \
perl-Devel--AssertOS--MacOSX--v13 \
perl-Devel--AssertOS--MacOSclassic \
perl-Devel--AssertOS--MachTen \
perl-Devel--AssertOS--MicrosoftWindows \
perl-Devel--AssertOS--MidnightBSD \
perl-Devel--AssertOS--Minix \
perl-Devel--AssertOS--MirOSBSD \
perl-Devel--AssertOS--NeXT \
perl-Devel--AssertOS--NetBSD \
perl-Devel--AssertOS--Netware \
perl-Devel--AssertOS--OS2 \
perl-Devel--AssertOS--OS390 \
perl-Devel--AssertOS--OS400 \
perl-Devel--AssertOS--OSF \
perl-Devel--AssertOS--OSFeatures--POSIXShellRedirection \
perl-Devel--AssertOS--OSFeatures--Systemd \
perl-Devel--AssertOS--OpenBSD \
perl-Devel--AssertOS--POSIXBC \
perl-Devel--AssertOS--QNX \
perl-Devel--AssertOS--QNX--Neutrino \
perl-Devel--AssertOS--QNX--v4 \
perl-Devel--AssertOS--RISCOS \
perl-Devel--AssertOS--Realtime \
perl-Devel--AssertOS--SCO \
perl-Devel--AssertOS--Solaris \
perl-Devel--AssertOS--Sun \
perl-Devel--AssertOS--SunOS \
perl-Devel--AssertOS--SysVr4 \
perl-Devel--AssertOS--SysVr5 \
perl-Devel--AssertOS--Unicos \
perl-Devel--AssertOS--Unix \
perl-Devel--AssertOS--VMESA \
perl-Devel--AssertOS--VMS \
perl-Devel--AssertOS--VOS \
perl-Devel--AssertOS--iOS \
perl-Devel--CheckOS \
perl-Devel-CheckOS"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0 \
perl-File--Find--Rule \
perl-File--Temp \
perl-Test--More \
perl-Test--Warnings"

inherit rpm
