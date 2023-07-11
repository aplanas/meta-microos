SUMMARY = "Development files for ocaml-calendar"
DESCRIPTION = "The ocaml-calendar-devel package contains libraries and signature files for \
developing applications that use ocaml-calendar."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "ocaml-calendar-devel-3.0.0-1.5.aarch64.rpm"
RPM_HASH = "1dc42c22c2c05b3d1e56dad6003139cec72701236de00ce20258815de0b09dc738f82a83a9fdeba839cdcdd67936a1059f49ce59086b174c73abc0114fdb0228"

RPROVIDES:${PN} += "ocaml-CalendarLib \
ocaml-CalendarLib--Calendar \
ocaml-CalendarLib--Calendar-builder \
ocaml-CalendarLib--Calendar-sig \
ocaml-CalendarLib--Date \
ocaml-CalendarLib--Date-sig \
ocaml-CalendarLib--Fcalendar \
ocaml-CalendarLib--Ftime \
ocaml-CalendarLib--Period \
ocaml-CalendarLib--Printer \
ocaml-CalendarLib--Time \
ocaml-CalendarLib--Time-Zone \
ocaml-CalendarLib--Time-sig \
ocaml-CalendarLib--Utils \
ocaml-CalendarLib--Version \
ocaml-calendar-devel \
ocamlfind-calendar \
ocamlx-CalendarLib \
ocamlx-CalendarLib--Calendar \
ocamlx-CalendarLib--Calendar-builder \
ocamlx-CalendarLib--Date \
ocamlx-CalendarLib--Fcalendar \
ocamlx-CalendarLib--Ftime \
ocamlx-CalendarLib--Printer \
ocamlx-CalendarLib--Time \
ocamlx-CalendarLib--Time-Zone \
ocamlx-CalendarLib--Utils \
ocamlx-CalendarLib--Version"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Re \
ocaml-Re-- \
ocaml-Re--Automata \
ocaml-Re--Category \
ocaml-Re--Core \
ocaml-Re--Cset \
ocaml-Re--Pmark \
ocaml-Re--Str \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-Unix \
ocaml-calendar \
ocamlfind-re \
ocamlfind-unix \
ocamlx-CamlinternalLazy \
ocamlx-Re--Str \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--String \
ocamlx-Unix"

inherit rpm
