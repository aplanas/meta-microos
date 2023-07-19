SUMMARY = "Extra translations for Firefox"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "115.0.2"

RPM_NAME = "MozillaFirefox-translations-other-115.0.2-1.1.aarch64.rpm"
RPM_HASH = "a59a773e312c570b1c4f73ccd0863d8865319268cb8f08626f23e1f64769017791b5371612bc09aab8dbb767e19550ce4adc6f8c64b23815acf6f842228a86e1"

RPROVIDES:${PN} += "MozillaFirefox-translations-other \
locale-MozillaFirefox-ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en-CA;eo;es-MX;et;eu;fa;ff;fy-NL;ga-IE;gd;gl;gn;gu-IN;he;hi-IN;hr;hsb;hy-AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne-NP;nn-NO;oc;pa-IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
