SUMMARY = "Pure Haskell YAML 1.2 processor"
DESCRIPTION = "'HsYAML' is a [YAML 1.2](http://yaml.org/spec/1.2/spec.html) processor, i.e. \
a library for parsing and serializing YAML documents. \
 \
Features of 'HsYAML' include: \
 \
* Pure Haskell implementation with small dependency footprint and emphasis on \
strict compliance with the [YAML 1.2 \
specification](http://yaml.org/spec/1.2/spec.html). * Direct decoding to native \
Haskell types via ('aeson'-inspired) typeclass-based API (see 'Data.YAML'). \
* Allows round-tripping while preserving ordering, anchors, and comments at \
Event-level. * Support for constructing custom YAML node graph representation \
(including support for cyclic YAML data structures). * Support for the standard \
(untyped) /Failsafe/, (strict) /JSON/, and (flexible) /Core/ 'schemas' \
providing implicit typing rules as defined in the YAML 1.2 specification \
(including support for user-defined custom schemas; see 'Data.YAML.Schema'). \
* Support for emitting YAML using /Failsafe/, (strict) /JSON/, and (flexible) \
/Core/ 'schemas' (including support for user-defined custom encoding schemas; \
see 'Data.YAML.Schema'). * Event-based API resembling LibYAML's Event-based API \
(see 'Data.YAML.Event'). * Low-level API access to lexical token-based scanner \
(see 'Data.YAML.Token'). \
 \
See also the <//hackage.haskell.org/package/HsYAML-aeson HsYAML-aeson> package \
which allows to decode and encode YAML by leveraging 'aeson''s 'FromJSON' and \
'ToJSON' instances."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-0.2.1.1-3.3.aarch64.rpm"
RPM_HASH = "8ae7b88dca54e3a9fee70dacc91fbb806210e8ba3e95caaa5eebde5ee1093985618c2f5ebeb84fd2bbc472ad4b6258573b4e2df86f17a8a270b954cb09cca53d"

RPROVIDES:${PN} += "ghc-HsYAML ghc-HsYAML(aarch-64) libHSHsYAML-0.2.1.1-KzoQvRN4UKW2jR1yND83sf-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
