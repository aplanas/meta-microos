SUMMARY = "Desktop Files Translations"
DESCRIPTION = "This package provides the translations for installed desktop files."
LICENSE = "MIT"

PV = "84.87.20230128.350400f"

RPM_NAME = "desktop-translations-84.87.20230128.350400f-1.1.noarch.rpm"
RPM_HASH = "bbafe95b727802bc957f79f04a97fe5fd23dde120d484e37f24158f5dd9132a999d6d60767e9d009754891369a615b168ec0f14435807b8a05bc9c9f51d2d256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "desktop-translations \
locale-af;ar;bg;be;bn;bs;ca;cs;cy;da;de;el;en-GB;eo;es;et;fi;fr;gl;gu;he;hi;hr;hu;id;it;ja;ka;kab;km;ko;lo;lt;mk;mr;nb;nl;pa;pl;pt;ro;ru;si;sk;sl;sr;sr@Latn;sv;ta;tr;uk;vi;wa;xh;zh-CN;zh-TW;zu"

RDEPENDS:${PN} += ""

inherit rpm
