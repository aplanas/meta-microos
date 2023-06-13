SUMMARY = "Open-source Chinese Font for Hei Ti"
DESCRIPTION = "The WenQuanYi Zen Hei is the first open-source Chinese font \
for Hei Ti, a sans-serif font style that are widely used for \
general purpose text formatting, and on-screen \
display of Chinese characters (such as in Windows Vista and Mac OS). \
Simple and elegant font outlines and slightly emboldened strokes \
makes the glyphs presenting higher contrast and therefore easy \
to read. The unique style of this font also provide a simple \
interface for adding grid-fitting information for further \
fine-tuning of the on-screen performance. \
 \
WenQuanYi Zen Hei contains arguably the largest number of Chinese \
Hanzi glyphs of all known open-source outline Chinese fonts: it has \
20194 Hanzi glyphs covering 97% of the Unicode CJK Unified \
Ideographics [4]. This font provides full coverage to the required \
code points for zh_cn, zh_sg, zh_tw, zh_hk and zh_mo locales. The \
total vector glyphs in this font is over 35000 including Latin characters, \
Japanese kanas, hanguls and symbols from many other languages. \
 \
Highly regarded WenQuanYi Bitmap Song fonts were embedded into this \
font for those who prefer shaper look of the text rendering, The \
embedded bitmap glyphs cover font sizes at 9pt, 10pt, 11pt \
and 12pt. \
 \
The primary purpose of developing this font is to provide CJK \
(Chinese-Japanese-Korean) users a visually pleasing, standard \
compliant, platform independent and compact solution for displaying \
and printing Chinese on their computers. \
 \
We wish you enjoying the font, and joining us to continuously \
improve this font for better performance and wider applications."
LICENSE = "GPL-2.0-with-font-exception"

PV = "0.9.47+snapshot20141019"

RPM_NAME = "wqy-zenhei-fonts-0.9.47+snapshot20141019-1.19.noarch.rpm"
RPM_HASH = "969300c60643ba442a83afdba2a3d30323d6c471c625a68dad99525dbc9505681ae4fd055f205defea7e4ab524268e155d350080669533b20e3c69fa62274797"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(wqy-zenhei-fonts) \
font(:lang=aa) \
font(:lang=af) \
font(:lang=an) \
font(:lang=av) \
font(:lang=ay) \
font(:lang=be) \
font(:lang=bg) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=ca) \
font(:lang=ce) \
font(:lang=ch) \
font(:lang=co) \
font(:lang=da) \
font(:lang=de) \
font(:lang=el) \
font(:lang=en) \
font(:lang=es) \
font(:lang=eu) \
font(:lang=fil) \
font(:lang=fj) \
font(:lang=fo) \
font(:lang=fr) \
font(:lang=fur) \
font(:lang=fy) \
font(:lang=gd) \
font(:lang=gl) \
font(:lang=gv) \
font(:lang=ho) \
font(:lang=ht) \
font(:lang=ia) \
font(:lang=id) \
font(:lang=ie) \
font(:lang=ik) \
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=ja) \
font(:lang=jv) \
font(:lang=kj) \
font(:lang=ko) \
font(:lang=kum) \
font(:lang=kwm) \
font(:lang=lb) \
font(:lang=lez) \
font(:lang=lg) \
font(:lang=li) \
font(:lang=mg) \
font(:lang=ms) \
font(:lang=nb) \
font(:lang=nds) \
font(:lang=ng) \
font(:lang=nl) \
font(:lang=nn) \
font(:lang=no) \
font(:lang=nr) \
font(:lang=ny) \
font(:lang=oc) \
font(:lang=om) \
font(:lang=os) \
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pt) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=ru) \
font(:lang=rw) \
font(:lang=sc) \
font(:lang=sel) \
font(:lang=sg) \
font(:lang=sm) \
font(:lang=sma) \
font(:lang=smj) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=sq) \
font(:lang=sr) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=su) \
font(:lang=sv) \
font(:lang=sw) \
font(:lang=tl) \
font(:lang=to) \
font(:lang=ts) \
font(:lang=uz) \
font(:lang=vo) \
font(:lang=wa) \
font(:lang=wo) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zh-cn) \
font(:lang=zh-sg) \
font(:lang=zh-tw) \
font(:lang=zu) \
font(wenquanyizenheimono) \
font(wenquanyizenheisharp) \
font(文泉驛正黑) \
font(文泉驛等寬正黑) \
font(文泉驛點陣正黑) \
font(文泉驿正黑) \
font(文泉驿点阵正黑) \
font(文泉驿等宽正黑) \
locale(zh_TW;zh_CN;zh_SG) \
scalable-font-zh-CN \
scalable-font-zh-SG \
scalable-font-zh-TW \
ttf-wqy-zenhei \
wqy-zenhei-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
perl"

inherit rpm
