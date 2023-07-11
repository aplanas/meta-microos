SUMMARY = "Perl support for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the Perl extension to ZNC."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-perl-1.8.2-3.8.aarch64.rpm"
RPM_HASH = "ca0616eb93f63030029f0d6bae74687c39be34c38550b76d0e8911b4bff75a43d72996c08fba87d6182785b5aa21151ee3f861a5ff171f8347f2859888bd35c1"

RPROVIDES:${PN} += "perl-ZNC \
perl-ZNC--BufLines \
perl-ZNC--CActionMessage \
perl-ZNC--CAuthBase \
perl-ZNC--CBufLine \
perl-ZNC--CBuffer \
perl-ZNC--CCTCPMessage \
perl-ZNC--CChan \
perl-ZNC--CClient \
perl-ZNC--CClientAuth \
perl-ZNC--CConfig \
perl-ZNC--CConfigEntry \
perl-ZNC--CCoreTranslationMixin \
perl-ZNC--CCron \
perl-ZNC--CDebug \
perl-ZNC--CDebugStream \
perl-ZNC--CDelayedTranslation \
perl-ZNC--CDir \
perl-ZNC--CException \
perl-ZNC--CExecSock \
perl-ZNC--CFPTimer \
perl-ZNC--CFile \
perl-ZNC--CGetAddrInfo \
perl-ZNC--CHTTPSock \
perl-ZNC--CIRCNetwork \
perl-ZNC--CIRCSock \
perl-ZNC--CIRCSocket \
perl-ZNC--CIncomingConnection \
perl-ZNC--CJoinMessage \
perl-ZNC--CKickMessage \
perl-ZNC--CLanguageScope \
perl-ZNC--CListener \
perl-ZNC--CMessage \
perl-ZNC--CModCommand \
perl-ZNC--CModInfo \
perl-ZNC--CModeMessage \
perl-ZNC--CModule \
perl-ZNC--CModuleEntry \
perl-ZNC--CModules \
perl-ZNC--CNick \
perl-ZNC--CNickMessage \
perl-ZNC--CNoticeMessage \
perl-ZNC--CNumericMessage \
perl-ZNC--COptionalTranslation \
perl-ZNC--CPartMessage \
perl-ZNC--CPerlModule \
perl-ZNC--CPerlSocket \
perl-ZNC--CPerlTimer \
perl-ZNC--CQuitMessage \
perl-ZNC--CRealListener \
perl-ZNC--CSCharBuffer \
perl-ZNC--CSConnection \
perl-ZNC--CSListener \
perl-ZNC--CSMonitorFD \
perl-ZNC--CSSSLConnection \
perl-ZNC--CSSockAddr \
perl-ZNC--CServer \
perl-ZNC--CSockCommon \
perl-ZNC--CSockManager \
perl-ZNC--CSocket \
perl-ZNC--CSocketManager \
perl-ZNC--CTable \
perl-ZNC--CTargetMessage \
perl-ZNC--CTemplate \
perl-ZNC--CTemplateLoopContext \
perl-ZNC--CTemplateOptions \
perl-ZNC--CTemplateTagHandler \
perl-ZNC--CTextMessage \
perl-ZNC--CTimer \
perl-ZNC--CTopicMessage \
perl-ZNC--CTranslation \
perl-ZNC--CTranslationDomainRefHolder \
perl-ZNC--CTranslationInfo \
perl-ZNC--CUser \
perl-ZNC--CUtils \
perl-ZNC--CWebSession \
perl-ZNC--CWebSessionMap \
perl-ZNC--CWebSock \
perl-ZNC--CWebSubPage \
perl-ZNC--CZNC \
perl-ZNC--CZNCSock \
perl-ZNC--CZNCTagHandler \
perl-ZNC--Csock \
perl-ZNC--MCString \
perl-ZNC--PerlMCString \
perl-ZNC--StrPair \
perl-ZNC--String \
perl-ZNC--VCString \
perl-ZNC--VChannels \
perl-ZNC--VIRCNetworks \
perl-ZNC--VListeners \
perl-ZNC--VPair \
perl-ZNC--VVString \
perl-ZNC--VWebSubPages \
perl-ZNC--ZNCSocketManager \
perl-ZNCc \
perl-perleval \
znc-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libperl.so \
libstdc++.so.6 \
perl \
znc"

inherit rpm
