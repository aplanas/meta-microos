SUMMARY = "Kernel firmware files for Qualcomm device drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Qualcomm device drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230814"

RPM_NAME = "kernel-firmware-qcom-20230814-1.1.noarch.rpm"
RPM_HASH = "6775a053c66406155fab78b7d51940578f06f35138cdb3131cfc5dbbecce2a0acc150ec190954d0ad3a9255bfe5bba66e3322c04f94487981b40fa9dcc3deb94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-a300-pfp.fw \
firmware-a300-pm4.fw \
firmware-qcom/a300-pfp.fw \
firmware-qcom/a300-pm4.fw \
firmware-qcom/a330-pfp.fw \
firmware-qcom/a330-pm4.fw \
firmware-qcom/a420-pfp.fw \
firmware-qcom/a420-pm4.fw \
firmware-qcom/a530-pfp.fw \
firmware-qcom/a530-pm4.fw \
firmware-qcom/a530-zap.mdt \
firmware-qcom/a530v3-gpmu.fw2 \
firmware-qcom/a630-gmu.bin \
firmware-qcom/a630-sqe.fw \
firmware-qcom/a650-gmu.bin \
firmware-qcom/a650-sqe.fw \
firmware-qcom/a660-gmu.bin \
firmware-qcom/a660-sqe.fw \
firmware-qcom/apq8016/WCNSS-qcom-wlan-nv-sbc.bin \
firmware-qcom/apq8016/mba.mbn \
firmware-qcom/apq8016/modem.mbn \
firmware-qcom/apq8016/wcnss.mbn \
firmware-qcom/apq8096/a530-zap.mbn \
firmware-qcom/apq8096/adsp.mbn \
firmware-qcom/apq8096/adspr.jsn \
firmware-qcom/apq8096/adspua.jsn \
firmware-qcom/apq8096/mba.mbn \
firmware-qcom/apq8096/modem.mbn \
firmware-qcom/apq8096/modemr.jsn \
firmware-qcom/leia-pfp-470.fw \
firmware-qcom/leia-pm4-470.fw \
firmware-qcom/sc8280xp/LENOVO/21BX/adspr.jsn \
firmware-qcom/sc8280xp/LENOVO/21BX/adspua.jsn \
firmware-qcom/sc8280xp/LENOVO/21BX/battmgr.jsn \
firmware-qcom/sc8280xp/LENOVO/21BX/cdspr.jsn \
firmware-qcom/sc8280xp/LENOVO/21BX/qcadsp8280.mbn \
firmware-qcom/sc8280xp/LENOVO/21BX/qccdsp8280.mbn \
firmware-qcom/sc8280xp/LENOVO/21BX/qcdxkmsuc8280.mbn \
firmware-qcom/sc8280xp/LENOVO/21BX/qcslpi8280.mbn \
firmware-qcom/sdm845/Thundercomm/db845c/slpi.mbn \
firmware-qcom/sdm845/Thundercomm/db845c/slpir.jsn \
firmware-qcom/sdm845/Thundercomm/db845c/slpius.jsn \
firmware-qcom/sdm845/a630-zap.mbn \
firmware-qcom/sdm845/adsp.mbn \
firmware-qcom/sdm845/adspr.jsn \
firmware-qcom/sdm845/adspua.jsn \
firmware-qcom/sdm845/cdsp.mbn \
firmware-qcom/sdm845/cdspr.jsn \
firmware-qcom/sdm845/mba.mbn \
firmware-qcom/sdm845/modem-nm.mbn \
firmware-qcom/sdm845/modem.mbn \
firmware-qcom/sdm845/modemuw.jsn \
firmware-qcom/sm8250/a650-zap.mbn \
firmware-qcom/sm8250/adsp.mbn \
firmware-qcom/sm8250/adspr.jsn \
firmware-qcom/sm8250/adspua.jsn \
firmware-qcom/sm8250/cdsp.mbn \
firmware-qcom/sm8250/cdspr.jsn \
firmware-qcom/yamato-pfp.fw \
firmware-qcom/yamato-pm4.fw \
kernel-firmware-qcom"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
