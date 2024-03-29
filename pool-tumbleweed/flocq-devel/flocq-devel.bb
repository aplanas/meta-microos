SUMMARY = "Development files for Flocq"
DESCRIPTION = "This package contains development files for Flocq."
LICENSE = "LGPL-3.0-or-later"

PV = "4.1.1"

RPM_NAME = "flocq-devel-4.1.1-1.5.aarch64.rpm"
RPM_HASH = "de764247033505476311dae1dcb878a8892053db7ac93497da49bfc2ec6b39aaacabb76357ea7aac9d16d221eb489d86ef3e6924d280b9613ec7bf77b0edda2a"

RPROVIDES:${PN} += "flocq-devel \
ocaml-NFlocq-Calc-Bracket \
ocaml-NFlocq-Calc-Div \
ocaml-NFlocq-Calc-Operations \
ocaml-NFlocq-Calc-Plus \
ocaml-NFlocq-Calc-Round \
ocaml-NFlocq-Calc-Sqrt \
ocaml-NFlocq-Core-Core \
ocaml-NFlocq-Core-Defs \
ocaml-NFlocq-Core-Digits \
ocaml-NFlocq-Core-FIX \
ocaml-NFlocq-Core-FLT \
ocaml-NFlocq-Core-FLX \
ocaml-NFlocq-Core-FTZ \
ocaml-NFlocq-Core-Float-prop \
ocaml-NFlocq-Core-Generic-fmt \
ocaml-NFlocq-Core-Raux \
ocaml-NFlocq-Core-Round-NE \
ocaml-NFlocq-Core-Round-pred \
ocaml-NFlocq-Core-Ulp \
ocaml-NFlocq-Core-Zaux \
ocaml-NFlocq-IEEE754-Binary \
ocaml-NFlocq-IEEE754-BinarySingleNaN \
ocaml-NFlocq-IEEE754-Bits \
ocaml-NFlocq-IEEE754-Int63Compat \
ocaml-NFlocq-IEEE754-Int63Copy \
ocaml-NFlocq-IEEE754-PrimFloat \
ocaml-NFlocq-Pff-Pff \
ocaml-NFlocq-Pff-Pff2Flocq \
ocaml-NFlocq-Pff-Pff2FlocqAux \
ocaml-NFlocq-Prop-Div-sqrt-error \
ocaml-NFlocq-Prop-Double-rounding \
ocaml-NFlocq-Prop-Mult-error \
ocaml-NFlocq-Prop-Plus-error \
ocaml-NFlocq-Prop-Relative \
ocaml-NFlocq-Prop-Round-odd \
ocaml-NFlocq-Prop-Sterbenz \
ocaml-NFlocq-Version \
ocamlx-NFlocq-Calc-Bracket \
ocamlx-NFlocq-Calc-Div \
ocamlx-NFlocq-Calc-Operations \
ocamlx-NFlocq-Calc-Plus \
ocamlx-NFlocq-Calc-Round \
ocamlx-NFlocq-Calc-Sqrt \
ocamlx-NFlocq-Core-Core \
ocamlx-NFlocq-Core-Defs \
ocamlx-NFlocq-Core-Digits \
ocamlx-NFlocq-Core-FIX \
ocamlx-NFlocq-Core-FLT \
ocamlx-NFlocq-Core-FLX \
ocamlx-NFlocq-Core-FTZ \
ocamlx-NFlocq-Core-Float-prop \
ocamlx-NFlocq-Core-Generic-fmt \
ocamlx-NFlocq-Core-Raux \
ocamlx-NFlocq-Core-Round-NE \
ocamlx-NFlocq-Core-Round-pred \
ocamlx-NFlocq-Core-Ulp \
ocamlx-NFlocq-Core-Zaux \
ocamlx-NFlocq-IEEE754-Binary \
ocamlx-NFlocq-IEEE754-BinarySingleNaN \
ocamlx-NFlocq-IEEE754-Bits \
ocamlx-NFlocq-IEEE754-Int63Compat \
ocamlx-NFlocq-IEEE754-Int63Copy \
ocamlx-NFlocq-IEEE754-PrimFloat \
ocamlx-NFlocq-Pff-Pff \
ocamlx-NFlocq-Pff-Pff2Flocq \
ocamlx-NFlocq-Pff-Pff2FlocqAux \
ocamlx-NFlocq-Prop-Div-sqrt-error \
ocamlx-NFlocq-Prop-Double-rounding \
ocamlx-NFlocq-Prop-Mult-error \
ocamlx-NFlocq-Prop-Plus-error \
ocamlx-NFlocq-Prop-Relative \
ocamlx-NFlocq-Prop-Round-odd \
ocamlx-NFlocq-Prop-Sterbenz \
ocamlx-NFlocq-Version"

RDEPENDS:${PN} += "coq-devel \
flocq \
ocaml-AcyclicGraph \
ocaml-CArray \
ocaml-CAst \
ocaml-CDebug \
ocaml-CEphemeron \
ocaml-CList \
ocaml-CMap \
ocaml-CPrimitives \
ocaml-CSet \
ocaml-CSig \
ocaml-CUnix \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Constr \
ocaml-Context \
ocaml-Conv-oracle \
ocaml-Cooking \
ocaml-Declarations \
ocaml-Environ \
ocaml-Esubst \
ocaml-Evar \
ocaml-Exninfo \
ocaml-Float64 \
ocaml-Genlambda \
ocaml-Hashcons \
ocaml-Hashset \
ocaml-Int \
ocaml-Loc \
ocaml-Mod-subst \
ocaml-NCoq-Arith-Factorial \
ocaml-NCoq-Arith-PeanoNat \
ocaml-NCoq-Bool-Bool \
ocaml-NCoq-Bool-Sumbool \
ocaml-NCoq-Classes-Morphisms \
ocaml-NCoq-Classes-Morphisms-Prop \
ocaml-NCoq-Classes-RelationClasses \
ocaml-NCoq-Floats-FloatAxioms \
ocaml-NCoq-Floats-FloatClass \
ocaml-NCoq-Floats-FloatOps \
ocaml-NCoq-Floats-PrimFloat \
ocaml-NCoq-Floats-SpecFloat \
ocaml-NCoq-Init-Datatypes \
ocaml-NCoq-Init-Decimal \
ocaml-NCoq-Init-Hexadecimal \
ocaml-NCoq-Init-Logic \
ocaml-NCoq-Init-Nat \
ocaml-NCoq-Init-Number \
ocaml-NCoq-Init-Peano \
ocaml-NCoq-Init-Specif \
ocaml-NCoq-Init-Wf \
ocaml-NCoq-Lists-List \
ocaml-NCoq-NArith-BinNat \
ocaml-NCoq-Numbers-BinNums \
ocaml-NCoq-Numbers-Cyclic-Abstract-CarryType \
ocaml-NCoq-Numbers-Cyclic-Int63-PrimInt63 \
ocaml-NCoq-Numbers-Cyclic-Int63-Uint63 \
ocaml-NCoq-PArith-BinPos \
ocaml-NCoq-Program-Basics \
ocaml-NCoq-QArith-QArith-base \
ocaml-NCoq-QArith-Qabs \
ocaml-NCoq-QArith-Qreduction \
ocaml-NCoq-Reals-Alembert \
ocaml-NCoq-Reals-Cauchy-ConstructiveCauchyReals \
ocaml-NCoq-Reals-Cauchy-ConstructiveCauchyRealsMult \
ocaml-NCoq-Reals-Cauchy-QExtra \
ocaml-NCoq-Reals-R-sqrt \
ocaml-NCoq-Reals-RIneq \
ocaml-NCoq-Reals-Raxioms \
ocaml-NCoq-Reals-Rbasic-fun \
ocaml-NCoq-Reals-Rdefinitions \
ocaml-NCoq-Reals-Rfunctions \
ocaml-NCoq-Reals-Rpow-def \
ocaml-NCoq-Reals-Rpower \
ocaml-NCoq-Reals-Rsqrt-def \
ocaml-NCoq-Reals-Rtrigo-def \
ocaml-NCoq-Reals-Rtrigo-fun \
ocaml-NCoq-Relations-Relation-Definitions \
ocaml-NCoq-Structures-OrdersTac \
ocaml-NCoq-ZArith-BinInt \
ocaml-NCoq-ZArith-BinIntDef \
ocaml-NCoq-ZArith-ZArith-dec \
ocaml-NCoq-ZArith-Zbool \
ocaml-NCoq-ZArith-Zeven \
ocaml-NCoq-ZArith-Znat \
ocaml-NCoq-ZArith-Zorder \
ocaml-NCoq-ZArith-Zpower \
ocaml-NCoq-setoid-ring-Ring-theory \
ocaml-Names \
ocaml-Nativecode \
ocaml-Nativeconv \
ocaml-Nativelib \
ocaml-Nativevalues \
ocaml-Opaqueproof \
ocaml-Parray \
ocaml-Pp \
ocaml-Predicate \
ocaml-Range \
ocaml-Reduction \
ocaml-Retroknowledge \
ocaml-Rtree \
ocaml-SList \
ocaml-Sorts \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--Uchar \
ocaml-Term \
ocaml-TransparentState \
ocaml-UGraph \
ocaml-Uint63 \
ocaml-Univ \
ocaml-Unix \
ocaml-Util \
ocaml-Values \
ocaml-Vmbytecodes \
ocaml-Vmemitcodes \
ocaml-Vmvalues \
ocamlx-CamlinternalLazy \
ocamlx-Nativecode \
ocamlx-Nativevalues"

inherit rpm
