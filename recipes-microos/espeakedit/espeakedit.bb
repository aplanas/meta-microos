SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "eSpeak is a software speech synthesizer for English, and some other languages. \
eSpeakEdit provides a User Interface to edit the eSpeak voices."
LICENSE = "GPL-3.0+"

PV = "1.48.03"

RPM_NAME = "espeakedit-1.48.03-2.27.aarch64.rpm"
RPM_HASH = "3bf36e6a84c2a08ea74649efa3766de8baf0d45531ec5f74e7959530f781395ad49784fc8f56bc5fa9f4bd0bb7712aca64752b6f750b4a6a7cb483f42c468235"

RPROVIDES:${PN} += "espeakedit \
espeakedit(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libportaudio.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_html-suse.so.9.0.0()(64bit) \
libwx_gtk2u_html-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
