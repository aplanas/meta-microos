SUMMARY = "Driver for (some) Brother laster printers"
DESCRIPTION = "Most Brother printers support a standard printer language such as \
PCL or PostScript, but not all do. If you have a monochrome Brother \
laser printer (or multi-function device) and the other open source \
drivers don't work, this one might help. \
 \
It is known to support these printers: \
 \
    Brother DCP-1510 series \
    Brother DCP-1600 series \
    Brother DCP-7030 \
    Brother DCP-7040 Brother DCP-7055 \
    Brother DCP-7055W \
    Brother DCP-7060D \
    Brother DCP-7065DN \
    Brother DCP-7080 \
    Brother DCP-L2500D series \
    Brother DCP-L2520D series \
    Brother DCP-L2540DW series \
    Brother HL-1110 series \
    Brother HL-1200 series \
    Brother HL-2030 series \
    Brother HL-2140 series \
    Brother HL-2220 series \
    Brother HL-2270DW series \
    Brother HL-2375DW \
    Brother HL-2390DW \
    Brother HL-5030 series \
    Brother HL-L2300D series \
    Brother HL-L2320D series \
    Brother HL-L2340D series \
    Brother HL-L2360D series \
    Brother MFC-1910W \
    Brother MFC-7240 \
    Brother MFC-7360N \
    Brother MFC-7365DN \
    Brother MFC-7420 \
    Brother MFC-7460DN \
    Brother MFC-7840W \
    Brother MFC-L2710DW series \
    Lenovo M7605D"
LICENSE = "GPL-2.0-or-later"

PV = "6+git20230220.2a49e32"

RPM_NAME = "printer-driver-brlaser-6+git20230220.2a49e32-1.1.aarch64.rpm"
RPM_HASH = "573ec53f5554f144af0f467867040c3456c0a25a581fdb438251a8a915a19751f35e9067a67283291f9e14d21c749b90a6c2ca115dd89582b50d0f1e572d8d08"

RPROVIDES:${PN} += "postscriptdriver-brother;dcp-1510-series; \
postscriptdriver-brother;dcp-1600-series; \
postscriptdriver-brother;dcp-7030; \
postscriptdriver-brother;dcp-7040; \
postscriptdriver-brother;dcp-7055; \
postscriptdriver-brother;dcp-7055w; \
postscriptdriver-brother;dcp-7060d; \
postscriptdriver-brother;dcp-7065dn; \
postscriptdriver-brother;dcp-7080; \
postscriptdriver-brother;dcp-7080d; \
postscriptdriver-brother;dcp-l2500d-series; \
postscriptdriver-brother;dcp-l2520d-series; \
postscriptdriver-brother;dcp-l2520dw-series; \
postscriptdriver-brother;dcp-l2540dw-series; \
postscriptdriver-brother;hl-1110-series; \
postscriptdriver-brother;hl-1200-series; \
postscriptdriver-brother;hl-2030-series; \
postscriptdriver-brother;hl-2140-series; \
postscriptdriver-brother;hl-2220-series; \
postscriptdriver-brother;hl-2270dw-series; \
postscriptdriver-brother;hl-5030-series; \
postscriptdriver-brother;hl-l2300d-series; \
postscriptdriver-brother;hl-l2320d-series; \
postscriptdriver-brother;hl-l2340d-series; \
postscriptdriver-brother;hl-l2360d-series; \
postscriptdriver-brother;hl-l2375dw-series; \
postscriptdriver-brother;hl-l2390dw; \
postscriptdriver-brother;mfc-1910w-series; \
postscriptdriver-brother;mfc-7240; \
postscriptdriver-brother;mfc-7360n; \
postscriptdriver-brother;mfc-7365dn; \
postscriptdriver-brother;mfc-7420; \
postscriptdriver-brother;mfc-7460dn; \
postscriptdriver-brother;mfc-l2710dw-series; \
printer-driver-brlaser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
