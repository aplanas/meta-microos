SUMMARY = "Resampler Application written with libzita-resampler"
DESCRIPTION = "zresample copies an audio file, changing the sample rate and/or the \
sample format. For 16-bit output it can also dither the audio signal. \
 \
zretune resamples an audio file by a the inverse of a ratio expressed \
in cents, without changing the nominal sample rate. The result is to \
change the musical pitch and lenght of the file. \
 \
The input for both tools can be any audio file readable by the \
libsndfile library. The output file type is either WAV, WAVEX, CAF, \
AIFF or FLAC."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "zita-resampler-tools-1.8.0-1.10.aarch64.rpm"
RPM_HASH = "9c1d5786cddb6590a5c00e6e32d5598ad27fbddedd5517aa4b77389a89fd77bae0c34e203b8220e8b9793cd06c9f50a125470e96990188141887efb2508407cb"

RPROVIDES:${PN} += "zita-resampler-tools \
zita-resampler-tools(aarch-64) \
zresample \
zretune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libzita-resampler.so.1()(64bit)"

inherit rpm
