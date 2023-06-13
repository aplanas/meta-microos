SUMMARY = "Tool for exploring Game of Life and other automata"
DESCRIPTION = "Key features: \
- Supports both bounded and unbounded universes. \
- Supports various topologies (plane, torus, Klein bottle, etc.). \
- Supports multi-state universes (cells can have up to 256 states). \
- Includes the QuickLife algorithm. \
- Uses the HashLife algorithm to see large patterns evolve at huge time scales. \
- Supports many different rules, including Wolfram's 1D rules, WireWorld, Generations, and John von Neumann's 29-state CA. \
- Uses the RuleLoader algorithm to load custom rules. \
- Reads RLE, macrocell, Life 1.05/1.06, dblife, and MCell files. \
- Can also read common graphic formats: BMP, PNG, GIF, TIFF. \
- Can extract patterns, scripts and rules from zip files. \
- Downloads files from online archives. \
- Includes a pattern collection. \
- Paste in patterns from the clipboard. \
- Unlimited undo/redo. \
- Unbounded zooming out for astronomical patterns. \
- Auto fit option keeps a generating pattern within view. \
- Full screen option (no menu/status/tool/scroll bars). \
- Supports multiple layers, including cloned layers. \
- HTML-based help with an integrated Life Lexicon. \
- Scriptable via Lua or Python. \
- User-configurable keyboard shortcuts."
LICENSE = "GPL-2.0-or-later"

PV = "4.2"

RPM_NAME = "golly-4.2-2.1.aarch64.rpm"
RPM_HASH = "420bc7b8e0c0fabdcfcc66483f06b97cc3e5874246c6d4ec031d82b769af1d5d57315bd152f53d1cc15061d248efbef7a75fed6483a394ac1a1037c0fc6c0c15"

RPROVIDES:${PN} += "application() \
application(golly.desktop) \
golly \
golly(aarch-64)"

RDEPENDS:${PN} += "golly-assets \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu_net-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_gl-suse.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse.so.9.0.0()(64bit) \
libz.so.1()(64bit) \
python3"

inherit rpm
