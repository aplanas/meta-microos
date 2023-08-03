SUMMARY = "A collection of tools for music analysis"
DESCRIPTION = "A python module to access the aubio library functions. \
 \
aubio is a library to label music and sounds. It listens to audio signals and attempts to detect events. For instance, when a drum is hit, at which frequency is a note, or at what tempo is a rhythmic melody. \
 \
Its features include segmenting a sound file before each of its attacks, performing pitch detection, tapping the beat and producing midi streams from live audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "python310-aubio-0.4.9-10.1.aarch64.rpm"
RPM_HASH = "15e9282e48ca78510f7a1385ce3b88573db527f5bf19190ce78221518d63a748fc5c87c2380e22a4a0216c22c0f6fe3fd525d962c72a019c35db9b9ad634847b"

RPROVIDES:${PN} += "python3.10dist-aubio \
python310-aubio \
python3dist-aubio"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
