SUMMARY = "HTTP wrapper around NRefactory allowing C# editor plugins"
DESCRIPTION = "HTTP wrapper around NRefactory allowing C# editor plugins to be written for any \
editor in any language. \
 \
This is the server component for the Vim OmniSharp plugin, YouCompleteMe, \
Sublime Text 2, Sublime Text 3, Emacs OmniSharp plugin and Atom plugin"
LICENSE = "MIT"

PV = "0+git.1440884867.e190291"

RPM_NAME = "omnisharp-server-0+git.1440884867.e190291-1.19.noarch.rpm"
RPM_HASH = "4f41d27c22546e130c96468c4d2b7217eefd760a2d7ab6fc83863291664cd9ee702672e314513106a7b91911e35f540ae5bbaacfc80b4dfa2c9ac0d8acb53eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "omnisharp-server"

RDEPENDS:${PN} += "mono-core"

inherit rpm
