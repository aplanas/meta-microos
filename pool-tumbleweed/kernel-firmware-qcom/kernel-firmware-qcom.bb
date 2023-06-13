SUMMARY = "Kernel firmware files for Qualcomm device drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Qualcomm device drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-qcom-20230517-1.1.noarch.rpm"
RPM_HASH = "56ef6111eb5fe8a793d779996cec45482d94bc98bcfd67205ad7830fc6e5073b65ac621fcba7e79b670385797a5926cb9045539cac285924a189e17a83d7324b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(a300_pfp.fw) \
firmware(a300_pm4.fw) \
firmware(qcom/a300_pfp.fw) \
firmware(qcom/a300_pm4.fw) \
firmware(qcom/a330_pfp.fw) \
firmware(qcom/a330_pm4.fw) \
firmware(qcom/a420_pfp.fw) \
firmware(qcom/a420_pm4.fw) \
firmware(qcom/a530_pfp.fw) \
firmware(qcom/a530_pm4.fw) \
firmware(qcom/a530_zap.mdt) \
firmware(qcom/a530v3_gpmu.fw2) \
firmware(qcom/a630_gmu.bin) \
firmware(qcom/a630_sqe.fw) \
firmware(qcom/a650_gmu.bin) \
firmware(qcom/a650_sqe.fw) \
firmware(qcom/a660_gmu.bin) \
firmware(qcom/a660_sqe.fw) \
firmware(qcom/apq8096/a530_zap.mbn) \
firmware(qcom/apq8096/adsp.mbn) \
firmware(qcom/apq8096/adspr.jsn) \
firmware(qcom/apq8096/adspua.jsn) \
firmware(qcom/apq8096/mba.mbn) \
firmware(qcom/apq8096/modem.mbn) \
firmware(qcom/apq8096/modemr.jsn) \
firmware(qcom/leia_pfp_470.fw) \
firmware(qcom/leia_pm4_470.fw) \
firmware(qcom/sc8280xp/LENOVO/21BX/adspr.jsn) \
firmware(qcom/sc8280xp/LENOVO/21BX/adspua.jsn) \
firmware(qcom/sc8280xp/LENOVO/21BX/battmgr.jsn) \
firmware(qcom/sc8280xp/LENOVO/21BX/cdspr.jsn) \
firmware(qcom/sc8280xp/LENOVO/21BX/qcadsp8280.mbn) \
firmware(qcom/sc8280xp/LENOVO/21BX/qccdsp8280.mbn) \
firmware(qcom/sc8280xp/LENOVO/21BX/qcdxkmsuc8280.mbn) \
firmware(qcom/sc8280xp/LENOVO/21BX/qcslpi8280.mbn) \
firmware(qcom/sdm845/a630_zap.mbn) \
firmware(qcom/sdm845/adsp.mbn) \
firmware(qcom/sdm845/adspr.jsn) \
firmware(qcom/sdm845/adspua.jsn) \
firmware(qcom/sdm845/cdsp.mbn) \
firmware(qcom/sdm845/cdspr.jsn) \
firmware(qcom/sdm845/mba.mbn) \
firmware(qcom/sdm845/modem.mbn) \
firmware(qcom/sdm845/modemuw.jsn) \
firmware(qcom/sm8250/a650_zap.mbn) \
firmware(qcom/sm8250/adsp.mbn) \
firmware(qcom/sm8250/adspr.jsn) \
firmware(qcom/sm8250/adspua.jsn) \
firmware(qcom/sm8250/cdsp.mbn) \
firmware(qcom/sm8250/cdspr.jsn) \
firmware(qcom/yamato_pfp.fw) \
firmware(qcom/yamato_pm4.fw) \
kernel-firmware-qcom"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
