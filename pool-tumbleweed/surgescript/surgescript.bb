SUMMARY = "A scripting language for games"
DESCRIPTION = "SurgeScript is a scripting language for games. It has been designed \
with the specific needs of games in mind. Its features include: \
- The state-machine pattern: objects are state machines, \
  making it easy to create in-game entities \
- The composition approach: you may design complex objects \
  and behaviors by means of composition \
- The hierarchy system: objects have a parent and may have children, \
  in a tree-like structure \
- The game loop: it's defined implicitly \
- Automatic garbage collection, object tagging and more! \
 \
SurgeScript is meant to be used in games and in interactive applications. \
It's easy to integrate it into existing code, it's easy to extend, \
it features a C-like syntax, and it's free and open-source software. \
 \
SurgeScript has been designed based on the experience of its developer \
dealing with game engines, applications related to computer graphics and so on. \
Some of the best practices have been incorporated into the language itself, \
making things really easy for developers and modders."
LICENSE = "Apache-2.0"

PV = "0.5.6.1"

RPM_NAME = "surgescript-0.5.6.1-2.3.aarch64.rpm"
RPM_HASH = "abebb7fd0944025b7e836db6f8cc504945e096b2ae899fb46703cef4e6fb817d0775604c6a1bdef85c9bcb2cc5d8c2979d0a8cef867f23343a36ac799f58f2f2"

RPROVIDES:${PN} += "metainfo() \
metainfo(surgescript.appdata.xml) \
surgescript \
surgescript(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsurgescript.so.0.5.6()(64bit)"

inherit rpm
