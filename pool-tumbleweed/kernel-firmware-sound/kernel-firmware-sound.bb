SUMMARY = "Kernel firmware files for various sound drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various sound drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-sound-20230517-1.1.noarch.rpm"
RPM_HASH = "346695c795bcb622e77aba8527736dfc7aac7a8eddd76df1082db15f2fced5c31b4f502fb23fca2f7ce5af3d6ef88660c908a520e0cdb39b94d3207db8843d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(cirrus/cs35l41-dsp1-spk-cali-103c896e-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c896e-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c896e.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8971.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8971.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8972.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8972.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8973.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8973.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8974.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8974.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8975-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8975-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8975.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8981-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8981-l1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8981-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8981-r1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8981.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c898e.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c898e.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c898f.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c898f.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8991.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8991.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8992.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8992.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8994.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8994.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8995.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8995.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c89c3-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c89c3-l1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c89c3-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c89c3-r1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c89c3.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c89c6-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c89c6-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c89c6.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b42.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b42.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b43.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b43.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b44.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b44.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b45.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b45.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b46.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b46.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b47.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b47.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b63-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b63-l1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b63-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b63-r1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b63.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b70.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b70.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b72.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b72.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b74.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b74.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b77.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b77.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b8f-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b8f-l1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b8f-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b8f-r1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8b92.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8c26.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-103c8c26.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-104312af-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-104312af-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-104312af-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-104312af-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-104312af.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431a8f-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431a8f-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431a8f-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431a8f-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431a8f.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431e02-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431e02-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431e02-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431e02-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431e02.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431e12-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431e12-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431e12-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431e12-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431e12.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431f12-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431f12-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431f12-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431f12-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-10431f12.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa22f1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa22f1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa22f1.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa22f2-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa22f2-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa22f2.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa22f3-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa22f3-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa22f3.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2316-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2316-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2316-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2316-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2316.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2317-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2317-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2317-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2317-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2317.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2318-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2318-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2318.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2319-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2319-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa2319.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa231a-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa231a-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa231a.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa3847-spkid0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa3847-spkid1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa3847.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa3855-spkid0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa3855-spkid1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-cali-17aa3855.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c896e-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c896e-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c896e.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8971.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8971.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8972.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8972.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8973.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8973.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8974.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8974.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8975-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8975-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8975.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8981-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8981-l1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8981-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8981-r1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8981.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c898e.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c898e.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c898f.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c898f.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8991.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8991.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8992.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8992.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8994.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8994.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8995.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8995.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c89c3-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c89c3-l1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c89c3-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c89c3-r1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c89c3.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c89c6-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c89c6-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c89c6.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b42.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b42.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b43.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b43.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b44.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b44.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b45.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b45.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b46.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b46.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b47.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b47.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b63-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b63-l1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b63-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b63-r1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b63.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b70.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b70.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b72.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b72.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b74.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b74.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b77.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b77.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b8f-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b8f-l1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b8f-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b8f-r1.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b8f.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b92.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8b92.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8c26.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-103c8c26.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-104312af-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-104312af-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-104312af-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-104312af-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-104312af.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431a8f-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431a8f-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431a8f-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431a8f-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431a8f.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431e02-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431e02-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431e02-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431e02-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431e02.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431e12-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431e12-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431e12-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431e12-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431e12.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431f12-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431f12-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431f12-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431f12-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-10431f12.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa22f1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa22f1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa22f1.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa22f2-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa22f2-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa22f2.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa22f3-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa22f3-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa22f3.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2316-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2316-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2316-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2316-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2316.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2317-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2317-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2317-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2317-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2317.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2318-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2318-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2318.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2319-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2319-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa2319.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa231a-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa231a-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa231a.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa3847-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa3847-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa3847-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa3847-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa3847.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa3855-spkid0-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa3855-spkid0-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa3855-spkid1-l0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa3855-spkid1-r0.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot-17aa3855.wmfw) \
firmware(cirrus/cs35l41-dsp1-spk-prot.bin) \
firmware(cirrus/cs35l41-dsp1-spk-prot.wmfw) \
firmware(cirrus/cs35l41/v6.39.0/halo_cspl_RAM_revB2_29.41.0.wmfw) \
firmware(cirrus/cs35l41/v6.47.0/halo_cspl_RAM_revB2_29.49.0.wmfw) \
firmware(cirrus/cs35l41/v6.61.1/halo_cspl_RAM_revB2_29.63.1.wmfw) \
firmware(cirrus/cs35l41/v6.63.0/halo_cspl_RAM_revB2_29.65.0.wmfw) \
firmware(ctefx.bin) \
firmware(ctspeq.bin) \
firmware(emi26/bitstream.fw) \
firmware(emi26/firmware.fw) \
firmware(emi26/loader.fw) \
firmware(emi62/bitstream.fw) \
firmware(emi62/loader.fw) \
firmware(emi62/midi.fw) \
firmware(emi62/spdif.fw) \
firmware(ess/maestro3_assp_kernel.fw) \
firmware(ess/maestro3_assp_minisrc.fw) \
firmware(intel/IntcSST2.bin) \
firmware(intel/avs/apl/dsp_basefw.bin) \
firmware(intel/avs/cnl/dsp_basefw.bin) \
firmware(intel/avs/skl/dsp_basefw.bin) \
firmware(intel/avs/skl/dsp_mod_7CAD0808-AB10-CD23-EF45-12AB34CD56EF.bin) \
firmware(intel/catpt/bdw/dsp_basefw.bin) \
firmware(intel/dsp_fw_bxtn.bin) \
firmware(intel/dsp_fw_bxtn_v2219.bin) \
firmware(intel/dsp_fw_bxtn_v3366.bin) \
firmware(intel/dsp_fw_cnl.bin) \
firmware(intel/dsp_fw_cnl_v1191.bin) \
firmware(intel/dsp_fw_cnl_v1858.bin) \
firmware(intel/dsp_fw_glk.bin) \
firmware(intel/dsp_fw_glk_v1814.bin) \
firmware(intel/dsp_fw_glk_v2768.bin) \
firmware(intel/dsp_fw_glk_v2880.bin) \
firmware(intel/dsp_fw_glk_v3366.bin) \
firmware(intel/dsp_fw_kbl.bin) \
firmware(intel/dsp_fw_kbl_v1037.bin) \
firmware(intel/dsp_fw_kbl_v2042.bin) \
firmware(intel/dsp_fw_kbl_v2630.bin) \
firmware(intel/dsp_fw_kbl_v3266.bin) \
firmware(intel/dsp_fw_kbl_v3402.bin) \
firmware(intel/dsp_fw_kbl_v3420.bin) \
firmware(intel/dsp_fw_kbl_v701.bin) \
firmware(intel/dsp_fw_release.bin) \
firmware(intel/dsp_fw_release_v3402.bin) \
firmware(intel/dsp_fw_release_v969.bin) \
firmware(intel/fw_sst_0f28.bin) \
firmware(intel/fw_sst_0f28.bin-48kHz_i2s_master) \
firmware(intel/fw_sst_0f28_ssp0.bin) \
firmware(intel/fw_sst_22a8.bin) \
firmware(korg/k1212.dsp) \
firmware(mediatek/sof-tplg/sof-mt8186.tplg) \
firmware(mediatek/sof-tplg/sof-mt8195-mt6359-rt1019-rt5682-dts.tplg) \
firmware(mediatek/sof-tplg/sof-mt8195-mt6359-rt1019-rt5682.tplg) \
firmware(mediatek/sof/sof-mt8186.ldc) \
firmware(mediatek/sof/sof-mt8186.ri) \
firmware(mediatek/sof/sof-mt8195.ldc) \
firmware(mediatek/sof/sof-mt8195.ri) \
firmware(sb16/alaw_main.csp) \
firmware(sb16/ima_adpcm_capture.csp) \
firmware(sb16/ima_adpcm_init.csp) \
firmware(sb16/ima_adpcm_playback.csp) \
firmware(sb16/mulaw_main.csp) \
firmware(yamaha/ds1_ctrl.fw) \
firmware(yamaha/ds1_dsp.fw) \
firmware(yamaha/ds1e_ctrl.fw) \
firmware(yamaha/yss225_registers.bin) \
kernel-firmware-sound"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm