SUMMARY = "YaST2 - Perl Bindings"
DESCRIPTION = "This adds an embedded Perl interpreter to YaST2 as a plug-in (in other \
words it will be loaded only if required). This is a very efficient way \
of calling Perl from within YaST2 YCP scripts."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-perl-bindings-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "d0aedc7e1836fbd6d8ddde1c669deee62d150c51b3f92ff54b0e0e9fe11f5aa9eb4e5bb2d988e22f9afebed0216a12fd2d9fe506a763c7442d828c8e41a1bc34"

RPROVIDES:${PN} += "libYCP.so.2 \
libpy2lang-perl.so.2 \
perl-YaPI \
perl-YaST--YCP \
perl-YaST--YCP--Autoload \
perl-YaST--YCP--Boolean \
perl-YaST--YCP--Byteblock \
perl-YaST--YCP--Float \
perl-YaST--YCP--Integer \
perl-YaST--YCP--String \
perl-YaST--YCP--Symbol \
perl-YaST--YCP--Term \
yast2-perl-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libperl.so \
libpy2UI.so.2 \
libpy2wfm.so.2 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
perl \
perl-Locale--gettext \
yast2-core \
yast2-ycp-ui-bindings"

inherit rpm
