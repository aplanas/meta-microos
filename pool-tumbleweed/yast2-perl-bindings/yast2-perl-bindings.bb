SUMMARY = "YaST2 - Perl Bindings"
DESCRIPTION = "This adds an embedded Perl interpreter to YaST2 as a plug-in (in other \
words it will be loaded only if required). This is a very efficient way \
of calling Perl from within YaST2 YCP scripts."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-perl-bindings-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "bf922e4106869863f8be4650354119390492ba11ffd69e153d826062568afce9950c980da9c4eca3b210fc67a480602eaca7ec7a94fad3e60d89a0b6cbf6b1fb"

RPROVIDES:${PN} += "libYCP.so.2()(64bit) \
libpy2lang_perl.so.2()(64bit) \
perl(YaPI) \
perl(YaST::YCP) \
perl(YaST::YCP::Autoload) \
perl(YaST::YCP::Boolean) \
perl(YaST::YCP::Byteblock) \
perl(YaST::YCP::Float) \
perl(YaST::YCP::Integer) \
perl(YaST::YCP::String) \
perl(YaST::YCP::Symbol) \
perl(YaST::YCP::Term) \
yast2-perl-bindings \
yast2-perl-bindings(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libperl.so()(64bit) \
libpy2UI.so.2()(64bit) \
libpy2wfm.so.2()(64bit) \
libstdc++.so.6()(64bit) \
liby2.so.4()(64bit) \
liby2util.so.5()(64bit) \
libycp.so.5()(64bit) \
libycpvalues.so.6()(64bit) \
perl \
perl(Locale::gettext) \
yast2-core \
yast2-ycp-ui-bindings"

inherit rpm
