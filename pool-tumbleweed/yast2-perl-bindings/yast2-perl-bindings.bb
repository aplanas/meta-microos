SUMMARY = "YaST2 - Perl Bindings"
DESCRIPTION = "This adds an embedded Perl interpreter to YaST2 as a plug-in (in other \
words it will be loaded only if required). This is a very efficient way \
of calling Perl from within YaST2 YCP scripts."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-perl-bindings-4.6.0-1.5.aarch64.rpm"
RPM_HASH = "6969776a98a910fe7821af421d22e1aeaa99ba10d8e96fd9539ac8f36681d2a927a219f67dbf23f6bac81492ca6d4ad4cc552649fc07b4ebbccf6a541e929a59"

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
