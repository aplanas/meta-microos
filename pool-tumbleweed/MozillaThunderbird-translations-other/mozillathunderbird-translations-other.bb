SUMMARY = "Extra translations for Thunderbird"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "102.11.2"

RPM_NAME = "MozillaThunderbird-translations-other-102.11.2-1.1.aarch64.rpm"
RPM_HASH = "3f18e229dc4c436e0cc5aa952c105c80a2637a8849150b4cd4872f1e933a5cbe166cd9f5a6bb99f1dd2b9f27d05a16e2fa541e647606f8d5869f4f6a51e56dea"

RPROVIDES:${PN} += "MozillaThunderbird-translations-other \
locale-MozillaThunderbird-ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en-CA;eo;es-MX;et;eu;fa;ff;fy-NL;ga-IE;gd;gl;gn;gu-IN;he;hi-IN;hr;hsb;hy-AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne-NP;nn-NO;oc;pa-IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh"

RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
