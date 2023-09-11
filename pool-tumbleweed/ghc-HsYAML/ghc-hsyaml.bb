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

RPM_NAME = "ghc-HsYAML-0.2.1.1-6.1.aarch64.rpm"
RPM_HASH = "e7f6a2fb1ec934ca2f996ca6332a7d917e2130879c3906afc1a0914c6663d42fc7ef83dd91d44ad854618cf8db841b6c97a2d6563ddb78f82bfc0620814a6cc2"

RPROVIDES:${PN} += "ghc-HsYAML \
libHSHsYAML-0.2.1.1-LCJxHEstqYgA5FP8nPmMDQ-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
