SUMMARY = "Perl support for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the Perl extension to ZNC."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-perl-1.8.2-3.7.aarch64.rpm"
RPM_HASH = "b7ef3f169d408ec05a627a38c7bbfbdcc32d0cdabe40eb9a1a52d1a291428f75866b2e804d3b5aadb570f0d2582ef9b920d18f21d60d6f0565180815d33aa2ef"

RPROVIDES:${PN} += "perl(ZNC) \
perl(ZNC::BufLines) \
perl(ZNC::CActionMessage) \
perl(ZNC::CAuthBase) \
perl(ZNC::CBufLine) \
perl(ZNC::CBuffer) \
perl(ZNC::CCTCPMessage) \
perl(ZNC::CChan) \
perl(ZNC::CClient) \
perl(ZNC::CClientAuth) \
perl(ZNC::CConfig) \
perl(ZNC::CConfigEntry) \
perl(ZNC::CCoreTranslationMixin) \
perl(ZNC::CCron) \
perl(ZNC::CDebug) \
perl(ZNC::CDebugStream) \
perl(ZNC::CDelayedTranslation) \
perl(ZNC::CDir) \
perl(ZNC::CException) \
perl(ZNC::CExecSock) \
perl(ZNC::CFPTimer) \
perl(ZNC::CFile) \
perl(ZNC::CGetAddrInfo) \
perl(ZNC::CHTTPSock) \
perl(ZNC::CIRCNetwork) \
perl(ZNC::CIRCSock) \
perl(ZNC::CIRCSocket) \
perl(ZNC::CIncomingConnection) \
perl(ZNC::CJoinMessage) \
perl(ZNC::CKickMessage) \
perl(ZNC::CLanguageScope) \
perl(ZNC::CListener) \
perl(ZNC::CMessage) \
perl(ZNC::CModCommand) \
perl(ZNC::CModInfo) \
perl(ZNC::CModeMessage) \
perl(ZNC::CModule) \
perl(ZNC::CModuleEntry) \
perl(ZNC::CModules) \
perl(ZNC::CNick) \
perl(ZNC::CNickMessage) \
perl(ZNC::CNoticeMessage) \
perl(ZNC::CNumericMessage) \
perl(ZNC::COptionalTranslation) \
perl(ZNC::CPartMessage) \
perl(ZNC::CPerlModule) \
perl(ZNC::CPerlSocket) \
perl(ZNC::CPerlTimer) \
perl(ZNC::CQuitMessage) \
perl(ZNC::CRealListener) \
perl(ZNC::CSCharBuffer) \
perl(ZNC::CSConnection) \
perl(ZNC::CSListener) \
perl(ZNC::CSMonitorFD) \
perl(ZNC::CSSSLConnection) \
perl(ZNC::CSSockAddr) \
perl(ZNC::CServer) \
perl(ZNC::CSockCommon) \
perl(ZNC::CSockManager) \
perl(ZNC::CSocket) \
perl(ZNC::CSocketManager) \
perl(ZNC::CTable) \
perl(ZNC::CTargetMessage) \
perl(ZNC::CTemplate) \
perl(ZNC::CTemplateLoopContext) \
perl(ZNC::CTemplateOptions) \
perl(ZNC::CTemplateTagHandler) \
perl(ZNC::CTextMessage) \
perl(ZNC::CTimer) \
perl(ZNC::CTopicMessage) \
perl(ZNC::CTranslation) \
perl(ZNC::CTranslationDomainRefHolder) \
perl(ZNC::CTranslationInfo) \
perl(ZNC::CUser) \
perl(ZNC::CUtils) \
perl(ZNC::CWebSession) \
perl(ZNC::CWebSessionMap) \
perl(ZNC::CWebSock) \
perl(ZNC::CWebSubPage) \
perl(ZNC::CZNC) \
perl(ZNC::CZNCSock) \
perl(ZNC::CZNCTagHandler) \
perl(ZNC::Csock) \
perl(ZNC::MCString) \
perl(ZNC::PerlMCString) \
perl(ZNC::StrPair) \
perl(ZNC::String) \
perl(ZNC::VCString) \
perl(ZNC::VChannels) \
perl(ZNC::VIRCNetworks) \
perl(ZNC::VListeners) \
perl(ZNC::VPair) \
perl(ZNC::VVString) \
perl(ZNC::VWebSubPages) \
perl(ZNC::ZNCSocketManager) \
perl(ZNCc) \
perl(perleval) \
znc-perl \
znc-perl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libperl.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
perl \
znc"

inherit rpm
