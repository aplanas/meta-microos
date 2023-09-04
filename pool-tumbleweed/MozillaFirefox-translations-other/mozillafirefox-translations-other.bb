SUMMARY = "Extra translations for Firefox"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "116.0.3"

RPM_NAME = "MozillaFirefox-translations-other-116.0.3-1.1.aarch64.rpm"
RPM_HASH = "41d25c241abb12acc66fc450f2596b04d207b13093c1709a3e0d13c658cd33ff83327cba762ab09e4182759ffd5fa3e6325e03e6992610afa6e20be6e4dcecbd"

RPROVIDES:${PN} += "MozillaFirefox-translations-other \
locale-MozillaFirefox-ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en-CA;eo;es-MX;et;eu;fa;ff;fy-NL;ga-IE;gd;gl;gn;gu-IN;he;hi-IN;hr;hsb;hy-AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne-NP;nn-NO;oc;pa-IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
