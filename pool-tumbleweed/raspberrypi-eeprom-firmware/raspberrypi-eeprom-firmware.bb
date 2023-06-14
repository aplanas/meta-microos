SUMMARY = "Raspberry Pi 4 EEPROM firmware blobs"
DESCRIPTION = "First stage bootloader fimware blobs for Raspberry Pi 4"
LICENSE = "SUSE-Firmware"

PV = "2023.01.11"

RPM_NAME = "raspberrypi-eeprom-firmware-2023.01.11-2.1.noarch.rpm"
RPM_HASH = "45babf88bb539406ded10db299a73549ffa122cd7bd9881878c7d577d2f3a35f8ca56759d626f2917c83232d906b5f323eb77314c7feb0a4663a3cd0b04a2e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-raspberrypi/bootloader/beta/pieeprom-2022-04-26.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-05-20.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-07-14.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-07-19.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-07-22.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-07-26.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-08-02.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-09-02.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-10-03.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-10-06.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-10-12.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-10-18.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-11-02.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-11-04.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-11-25.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2022-12-07.bin \
firmware-raspberrypi/bootloader/beta/pieeprom-2023-01-04.bin \
firmware-raspberrypi/bootloader/beta/recovery.bin \
firmware-raspberrypi/bootloader/beta/vl805-000138a1.bin \
firmware-raspberrypi/bootloader/beta/vl805-000138c0.bin \
firmware-raspberrypi/bootloader/critical/pieeprom-2020-04-16.bin \
firmware-raspberrypi/bootloader/critical/pieeprom-2020-09-03.bin \
firmware-raspberrypi/bootloader/critical/pieeprom-2021-03-18.bin \
firmware-raspberrypi/bootloader/critical/pieeprom-2021-04-29.bin \
firmware-raspberrypi/bootloader/critical/pieeprom-2022-01-25.bin \
firmware-raspberrypi/bootloader/critical/pieeprom-2022-04-26.bin \
firmware-raspberrypi/bootloader/critical/pieeprom-2022-11-25.bin \
firmware-raspberrypi/bootloader/critical/pieeprom-2022-12-07.bin \
firmware-raspberrypi/bootloader/critical/pieeprom-2023-01-11.bin \
firmware-raspberrypi/bootloader/critical/recovery.bin \
firmware-raspberrypi/bootloader/critical/vl805-000137ad.bin \
firmware-raspberrypi/bootloader/critical/vl805-000138a1.bin \
firmware-raspberrypi/bootloader/critical/vl805-000138c0.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2020-04-16.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2020-06-15.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2020-07-16.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2020-07-31.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2020-09-03.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2020-12-11.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2021-01-11.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2021-01-16.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2021-02-16.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2021-03-18.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2021-04-29.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2021-07-06.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2021-11-22.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2021-12-02.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-01-25.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-02-08.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-03-10.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-04-26.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-07-19.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-07-22.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-07-26.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-08-02.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-09-02.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-10-18.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-11-04.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-11-25.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2022-12-07.bin \
firmware-raspberrypi/bootloader/stable/pieeprom-2023-01-11.bin \
firmware-raspberrypi/bootloader/stable/recovery.bin \
firmware-raspberrypi/bootloader/stable/vl805-000137ad.bin \
firmware-raspberrypi/bootloader/stable/vl805-000138a1.bin \
firmware-raspberrypi/bootloader/stable/vl805-000138c0.bin \
raspberrypi-eeprom-firmware \
raspberrypi-firmware-eeprom"

RDEPENDS:${PN} += "raspberrypi-eeprom"

inherit rpm
