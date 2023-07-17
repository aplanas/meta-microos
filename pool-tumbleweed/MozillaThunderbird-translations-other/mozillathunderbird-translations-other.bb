SUMMARY = "Extra translations for Thunderbird"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "102.13.0"

RPM_NAME = "MozillaThunderbird-translations-other-102.13.0-1.1.aarch64.rpm"
RPM_HASH = "294685a01414450b253fdc63ef25b79edeec80b49aba072d4ee61668fc10d85c54dba5f7d15aa8daa34eed0a34c3a55dda0114ae7ac390caac4bf6571c876726"

RPROVIDES:${PN} += "MozillaThunderbird-translations-other \
locale-MozillaThunderbird-ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en-CA;eo;es-MX;et;eu;fa;ff;fy-NL;ga-IE;gd;gl;gn;gu-IN;he;hi-IN;hr;hsb;hy-AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne-NP;nn-NO;oc;pa-IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh"

RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
