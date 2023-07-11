SUMMARY = "C library for Convolutional codes and Reed-Solomon"
DESCRIPTION = "libcorrect is a library for Forward Error Correction. By using libcorrect, \
extra redundancy can be encoded into a packet of data and then be sent \
across a lossy channel. When the packet is received, it can be decoded to \
recover the original, pre-encoded data. \
 \
libcorrect accomplishes this task with two algorithms, Convolutional codes \
and Reed-Solomon. Convolutional codes are robust to a constant background \
noise, while Reed-Solomon error correction is effective at dealing with \
noise that occurs in bursts. These algorithms have played an important role \
in telecommunications. libcorrect uses a Viterbi algorithm decoder to decode \
convolutional codes."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git.20180109"

RPM_NAME = "libcorrect0_0_0-0.0.0+git.20180109-3.9.aarch64.rpm"
RPM_HASH = "926d68ea2f28294b1c5f19b22fca5fe838d806ebd8c66e9ed77ea082743cc655097fe589d42995103da50825f8b0a58a365fc2681e205b7df42aa99584cff2fe"

RPROVIDES:${PN} += "libcorrect.so.0.0.0 \
libcorrect0-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
